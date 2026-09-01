
```drawio-resource
../family.drawio
```

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of the family as an organization: members who provide, consume, develop, and transfer capabilities across generations, with kinship as typed relationships and [GEDCOM](https://www.gedcom.org/) as the interoperability format.

[TOC levels=6]


This model takes over the [original family model](https://family.models.nasdanika.org/original).
The original family model purpose was to mimic the [Eclipse Sirius Basic Family Model](https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily) at a time when Draw.io was the only authoring surface, and it is kept for side-by-side comparison and as the teaching example behind the [semantic mapping demo](https://nasdanika-demos.github.io/family-semantic-mapping/).

## Position: the top of the tower

The family model sits at the very top of the micro-model tower, on the [org design model](https://org-design.models.nasdanika.org/), and more precisely on the AI org model (org design plus [AI governance](https://ai.governance.models.nasdanika.org/)) once it is available.
Two reasons for taking the AI governance branch: it does not hurt those who never touch AI, because tower floors are additive; and anyone providing services over family models (a family advisor running agents, for instance) needs exactly that vocabulary: oversight, evaluations, incidents, risk tiers.

The initial design went the other way: a genealogy balcony off the lowest floor, climbing as the tower grew.
The reversal is the insight. A family *is* an organization: members with capabilities, concerns to resolve, decisions to make and bind, work to do, events to remember, things to govern.
Placed at the top, the model becomes nearly nothing, because the tower provides:

* A member is an org design Person, hence a capability provider and a persona with concerns (product management), an architecture element, workable, governed, staged, access controlled, owned, documented, with provenance.
* Kinship ties are architecture relationships with kind catalogs (parent, spouse; biological, adoptive, step, foster), so the [family-ties demo](https://github.com/Nasdanika-Demos/family-ties) vocabulary is instance data in the model itself.
* Events shrink onto the NxCore `Event` (a named, documented Temporal); GEDCOM's approximate and range dates collapse into nxcore temporals.
* What this model actually contributes: kinship semantics, GEDCOM round-tripping (xrefs), and the domain's two-century-old provenance discipline (sources, citations, quality ratings).

Every move up deleted something. The tower got taller and the model got smaller.

## Why the family

Selling model-driven anything to organizations is famously hard: it is not people's own money and not people's own inefficiencies.
In families it is both.
There are millions of developers and tech-savvy people with families, every one of them owning exactly one dataset they are guaranteed to still care about in thirty years.
And because the model sits at the top of the tower, it exercises every floor below it: the family model is the showcase, and the showcase is how organizations discover the tower.

The trust posture is a requirement, not a feature: the core is open source and the family owns the model, locally, in Git, inalienably.
Providers and agents interact with projections of the model, never the model itself.

## Applications

In the spirit of the [product management model](https://product-management.models.nasdanika.org/): personas hold concerns, capabilities are pulled by concerns, and AI operates on scoped contexts.
The family flips the usual direction: instead of providers pushing products, the family models its concerns and pulls.

**Family tree as generated views.** The founding use case: a relative asks for a picture.
Wall chart, interactive Draw.io diagram, static site, descendants report, research list: all renderings of one model, regenerated on change, with photographs and stylized icons generated from photographs where a photo should not be public.

**Research agent.** Find evidence that a great-grandfather worked for the railroad between 1900 and 1920: locate the person, correlate residences and occupations, search newspaper and census archives, return claims with citations and quality ratings.
A historian swarm generalizes this: specialized agents (newspapers, census, military, immigration) each work a scoped partition and publish findings back with receipts.

**Life stories and knowledge preservation.** Biographies, timelines, documentary scripts, and oral-history interview guides generated from the graph, grounded in cited events.
The interview with the oldest living relative is the one deadline in genealogy that is real; the work floor holds it.

**Career and opportunity intelligence.** A family is a latent capability network that LinkedIn ignores.
Concern: a daughter wants a biotech internship.
The graph knows the grandmother's cousin is on a hospital board and the uncle is a health-insurance actuary.
Agents answer capability questions: what careers have succeeded in this family, who can mentor whom, what is the family's composite capability, what is missing for the venture three cousins keep talking about.
A resume is a projection of a member's capability subgraph for a purpose, not a document.

**Provisioning: analysis and binding, not recommendations.** Concern: pay for college.
The system does not recommend a provider; it computes a decision space (loans, savings plus scholarships, community college and transfer), the family binds a decision, and only then does the next layer of decisions materialize.
Plans are living decision graphs: revisit a binding (the scholarship fell through) and downstream consequences recompute.
AI computes consequence spaces; humans bind decisions.
The same pattern covers first-home purchase, elder-care alternatives, and education strategy.

**Protected overlays.** Hereditary health patterns and family finances (trusts, ownership, succession) are separate overlay models composed through scoped contexts and access control.
The newspaper-research agent never sees genetic markers; the medical agent never sees trust beneficiaries.
Audience-tiered publishing works the same way: full site for close family, names-only for distant relatives, deceased-only for the public, one model, three generated sites.

**Family as capability provider.** The family is not only a consumer: mentoring, caregiving, housing, introductions, and investment are capabilities members provide to each other, and the model makes the exchange visible, which is what turns a tree of ancestors into a living capability ecosystem.

## Resources

* [GEDCOM specifications](https://gedcom.io/): GEDCOM 7 specification with sample and test files, and the 5.5.1 specification the major vendors still export.
* **Royal92**: the classic public-domain GEDCOM of European royalty (about 3000 individuals), widely mirrored; the public demo dataset, so no family data is exposed while the machinery is shown.
* [gedcom4j](https://github.com/frizbog/gedcom4j): mature Java reader/writer for GEDCOM 5.5/5.5.1; the native line-based Resource is preferred for marker fidelity, with gedcom4j as a reference implementation.
* [Original family model](https://family.models.nasdanika.org/original/) and the [semantic mapping demo](https://nasdanika-demos.github.io/family-semantic-mapping/): the teaching lineage this model grew out of.
* [family-ties demo](https://github.com/Nasdanika-Demos/family-ties): the kinship vocabulary, now expressible as a relationship kind catalog inside the model.

## Model overview

| Area | Types |
|------|-------|
| Root | `Family` (extends org design `Organization`; federates by reference) |
| Members | `Member` (org design `Person` + architecture `Element` + GEDCOM `Record`), `PersonalName`, `Sex` |
| Kinship | `Kinship` (architecture `Relationship`; kinds as catalog; carries FAM xref and family events) |
| Events | `EventKind` (GEDCOM tag catalog), `Event` (shrinks onto NxCore `Event`) |
| Provenance | `Citation` (QUAY quality), `Source`, `Repository` |
| Media and notes | `Media`, `Note` |
